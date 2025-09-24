import csv
from collections import defaultdict
from datetime import datetime

def analyze_expenses(file_path):
    total = 0.0
    category_totals = defaultdict(float)
    dates = set()

    with open(file_path, newline='') as csvfile:
        reader = csv.reader(csvfile)
        for row in reader:
            if len(row) != 3:
                continue  # skip malformed rows
            date_str, category, amount_str = row
            try:
                amount = float(amount_str)
                total += amount
                category_totals[category] += amount
                dates.add(date_str)
            except ValueError:
                continue  # skip invalid amounts
            

    print(f"\n📊 Expense Report")
    print(f"Total spent: GHS {total:.2f}")
    print(f"Average daily spend: GHS {total / len(dates):.2f}" if dates else "No valid dates found")
    print("\nSpending by category:")
    for cat, amt in category_totals.items():
        print(f"  {cat}: GHS {amt:.2f}")

# Run the analyzer
analyze_expenses("C:\\Users\\nowus\\Music\\coding Project\\CrossLanguageExpenseLogger\\expenses.csv")

